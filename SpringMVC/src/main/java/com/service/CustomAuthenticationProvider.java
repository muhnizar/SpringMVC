package com.service;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomAuthenticationProvider implements AuthenticationProvider {
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        try {
            boolean valid = false;
            String username = authentication.getName();
            String password = authentication.getCredentials().toString();

//            Date dateIndonesia = null;
//            try {
//                dateIndonesia = DateUtil.parseToDate(dateOfBirth, CONSTANT_DATE.DATE_FORMAT_VERSION1);
//            } catch (Exception e) {
//                dateIndonesia = DateUtil.parseToDate(dateOfBirth, CONSTANT_DATE.DATE_FORMAT_VERSION2);
//            }
//            ContractInfo contractInfo = contractInfoDAOImpl.getContractInfoByDateOfBirthByPhoneNumberByLatestVersion(dateIndonesia, phoneNumber);
//            if (contractInfo == null) {
//                throw new BadCredentialsException("Tanggal Lahir atau Nomor Kontrak tidak ditemukan");
//            }
//            long difference = (new Date().getTime() - contractInfo.getCreatedDate().getTime()) / 86400000;
//            if (contractInfo != null) {
//                valid = true;
//            }*/
//            if (difference <= 14) {
//                if (valid) {
//                    if (contractInfo.getPage() == 0) {
//                        contractInfo.setPage(1);
//                        contractInfoDAOImpl.updateContractDetail(contractInfo);
//                    }
//                    // if application is exist then grant access to eSignature page
//                    List<GrantedAuthority> roles = new ArrayList<>();
//                    roles.add(new GrantedAuthority() {
//                        @Override
//                        public String getAuthority() {
//                            return "ROLE_USER";
//                        }
//                    });
//                    activityReportService.insertActivityReport(contractInfo, ActivityList.CUST_LOGIN.name(), "Login Page", ENUM_STATUS_CODE.SUCCESS.name(), new Date(), new Date(), ENUM_ACTIVITY.LOGIN_ACTIVITY.toString(), contractInfo.getName());
//
//                    LOGGER.info("User Login " + contractInfo.toString());
//                    return new UsernamePasswordAuthenticationToken(contractInfo.getId(), phoneNumber, roles);
//                } else {
//                    throw new BadCredentialsException("Tanggal Lahir atau Nomor Kontrak tidak ditemukan");
//                }
//            } else {
//                throw new BadCredentialsException("Mohon maaf, Anda telah melewati batas waktu penandatanganan kontrak.");
//            }

            List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
                    roles.add(new GrantedAuthority() {
                        public String getAuthority() {
                            return "ROLE_USER";
                        }
                    });
            return new UsernamePasswordAuthenticationToken(username, password, roles);
        } catch (Exception e) {
            throw new BadCredentialsException(e.getMessage());
        }
    }

    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
