// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerSecurityAlertPolicyArgs;
import io.pulumi.azurenative.sql.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A server security alert policy.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerSecurityAlertPolicy Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/securityalert-4799/providers/Microsoft.Sql/servers/securityalert-6440/securityAlertPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerSecurityAlertPolicy")
public class ServerSecurityAlertPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the UTC creation time of the policy.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Specifies the UTC creation time of the policy.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force
     * 
     */
    @OutputExport(name="disabledAlerts", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disabledAlerts;

    /**
     * @return Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force
     * 
     */
    public Output</* @Nullable */ List<String>> getDisabledAlerts() {
        return this.disabledAlerts;
    }
    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    @OutputExport(name="emailAccountAdmins", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> emailAccountAdmins;

    /**
     * @return Specifies that the alert is sent to the account administrators.
     * 
     */
    public Output</* @Nullable */ Boolean> getEmailAccountAdmins() {
        return this.emailAccountAdmins;
    }
    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    @OutputExport(name="emailAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> emailAddresses;

    /**
     * @return Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    public Output</* @Nullable */ List<String>> getEmailAddresses() {
        return this.emailAddresses;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    @OutputExport(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    public Output</* @Nullable */ Integer> getRetentionDays() {
        return this.retentionDays;
    }
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @OutputExport(name="storageAccountAccessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountAccessKey;

    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @OutputExport(name="storageEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageEndpoint;

    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    public Output</* @Nullable */ String> getStorageEndpoint() {
        return this.storageEndpoint;
    }
    /**
     * SystemData of SecurityAlertPolicyResource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return SystemData of SecurityAlertPolicyResource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerSecurityAlertPolicy(String name, ServerSecurityAlertPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerSecurityAlertPolicy", name, args == null ? ServerSecurityAlertPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerSecurityAlertPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerSecurityAlertPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerSecurityAlertPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerSecurityAlertPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServerSecurityAlertPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerSecurityAlertPolicy(name, id, options);
    }
}
