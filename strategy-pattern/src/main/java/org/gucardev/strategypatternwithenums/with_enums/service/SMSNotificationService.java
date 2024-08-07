package org.gucardev.strategypatternwithenums.with_enums.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gucardev.strategypatternwithenums.with_enums.dto.NotificationDto;
import org.gucardev.strategypatternwithenums.with_enums.helper.SMSHelper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SMSNotificationService implements NotificationService {

    private final SMSHelper smsHelper;

    @Override
    public void sendNotification(NotificationDto notificationDto) {
        log.info("Sending sms notification -> {}", notificationDto.getMessage());
        smsHelper.sendSMS("user", "message");
    }
}
