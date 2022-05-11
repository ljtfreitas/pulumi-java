// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AutomationRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleConditionArgs Empty = new AutomationRuleConditionArgs();

    /**
     * The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The property to use for evaluate the condition. Possible values include: `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentDescription`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData`, `Url`.
     * 
     */
    @Import(name="property", required=true)
    private Output<String> property;

    /**
     * @return The property to use for evaluate the condition. Possible values include: `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentDescription`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData`, `Url`.
     * 
     */
    public Output<String> property() {
        return this.property;
    }

    /**
     * Specifies a list of values to use for evaluate the condition.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Specifies a list of values to use for evaluate the condition.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private AutomationRuleConditionArgs() {}

    private AutomationRuleConditionArgs(AutomationRuleConditionArgs $) {
        this.operator = $.operator;
        this.property = $.property;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleConditionArgs $;

        public Builder() {
            $ = new AutomationRuleConditionArgs();
        }

        public Builder(AutomationRuleConditionArgs defaults) {
            $ = new AutomationRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param property The property to use for evaluate the condition. Possible values include: `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentDescription`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData`, `Url`.
         * 
         * @return builder
         * 
         */
        public Builder property(Output<String> property) {
            $.property = property;
            return this;
        }

        /**
         * @param property The property to use for evaluate the condition. Possible values include: `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentDescription`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData`, `Url`.
         * 
         * @return builder
         * 
         */
        public Builder property(String property) {
            return property(Output.of(property));
        }

        /**
         * @param values Specifies a list of values to use for evaluate the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Specifies a list of values to use for evaluate the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Specifies a list of values to use for evaluate the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AutomationRuleConditionArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.property = Objects.requireNonNull($.property, "expected parameter 'property' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
