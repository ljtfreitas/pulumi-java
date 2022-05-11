// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EmailTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailTemplateArgs Empty = new EmailTemplateArgs();

    /**
     * The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The body of the Email. Its format has to be a well-formed HTML document.
     * 
     */
    @Import(name="body", required=true)
    private Output<String> body;

    /**
     * @return The body of the Email. Its format has to be a well-formed HTML document.
     * 
     */
    public Output<String> body() {
        return this.body;
    }

    /**
     * The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The subject of the Email.
     * 
     */
    @Import(name="subject", required=true)
    private Output<String> subject;

    /**
     * @return The subject of the Email.
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }

    /**
     * The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
     * 
     */
    @Import(name="templateName", required=true)
    private Output<String> templateName;

    /**
     * @return The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }

    private EmailTemplateArgs() {}

    private EmailTemplateArgs(EmailTemplateArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.body = $.body;
        this.resourceGroupName = $.resourceGroupName;
        this.subject = $.subject;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailTemplateArgs $;

        public Builder() {
            $ = new EmailTemplateArgs();
        }

        public Builder(EmailTemplateArgs defaults) {
            $ = new EmailTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the Email Template should exist. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param body The body of the Email. Its format has to be a well-formed HTML document.
         * 
         * @return builder
         * 
         */
        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The body of the Email. Its format has to be a well-formed HTML document.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the API Management Email Template should exist. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subject The subject of the Email.
         * 
         * @return builder
         * 
         */
        public Builder subject(Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The subject of the Email.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param templateName The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateName(Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName The name of the Email Template. Possible values are `AccountClosedDeveloper`, `ApplicationApprovedNotificationMessage`, `ConfirmSignUpIdentityDefault`, `EmailChangeIdentityDefault`, `InviteUserNotificationMessage`, `NewCommentNotificationMessage`, `NewDeveloperNotificationMessage`, `NewIssueNotificationMessage`, `PasswordResetByAdminNotificationMessage`, `PasswordResetIdentityDefault`, `PurchaseDeveloperNotificationMessage`, `QuotaLimitApproachingDeveloperNotificationMessage`, `RejectDeveloperNotificationMessage`, `RequestDeveloperNotificationMessage`. Changing this forces a new API Management Email Template to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public EmailTemplateArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
