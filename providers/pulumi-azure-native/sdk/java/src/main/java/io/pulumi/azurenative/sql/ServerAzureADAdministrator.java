// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerAzureADAdministratorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Azure Active Directory administrator.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerAzureADAdministrator activeDirectory /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-6440/administrators/ActiveDirectory 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerAzureADAdministrator")
public class ServerAzureADAdministrator extends io.pulumi.resources.CustomResource {
    /**
     * Type of the sever administrator.
     * 
     */
    @OutputExport(name="administratorType", type=String.class, parameters={})
    private Output<String> administratorType;

    /**
     * @return Type of the sever administrator.
     * 
     */
    public Output<String> getAdministratorType() {
        return this.administratorType;
    }
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @OutputExport(name="azureADOnlyAuthentication", type=Boolean.class, parameters={})
    private Output<Boolean> azureADOnlyAuthentication;

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Output<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * Login name of the server administrator.
     * 
     */
    @OutputExport(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return Login name of the server administrator.
     * 
     */
    public Output<String> getLogin() {
        return this.login;
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
     * SID (object ID) of the server administrator.
     * 
     */
    @OutputExport(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    public Output<String> getSid() {
        return this.sid;
    }
    /**
     * Tenant ID of the administrator.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return Tenant ID of the administrator.
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
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
    public ServerAzureADAdministrator(String name, ServerAzureADAdministratorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADAdministrator", name, args == null ? ServerAzureADAdministratorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerAzureADAdministrator(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADAdministrator", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20140401:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20180601preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20190601preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerAzureADAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerAzureADAdministrator").build())
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
    public static ServerAzureADAdministrator get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerAzureADAdministrator(name, id, options);
    }
}
