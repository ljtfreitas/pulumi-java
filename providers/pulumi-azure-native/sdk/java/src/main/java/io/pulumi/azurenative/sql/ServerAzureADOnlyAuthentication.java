// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerAzureADOnlyAuthenticationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Azure Active Directory only authentication.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerAzureADOnlyAuthentication Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-6440/azureadonlyauthentications/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerAzureADOnlyAuthentication")
public class ServerAzureADOnlyAuthentication extends io.pulumi.resources.CustomResource {
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @Export(name="azureADOnlyAuthentication", type=Boolean.class, parameters={})
    private Output<Boolean> azureADOnlyAuthentication;

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Output<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ServerAzureADOnlyAuthenticationArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.ServerAzureADOnlyAuthenticationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.ServerAzureADOnlyAuthenticationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServerAzureADOnlyAuthentication(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerAzureADOnlyAuthentication(String name) {
        this(name, ServerAzureADOnlyAuthenticationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerAzureADOnlyAuthentication(String name, ServerAzureADOnlyAuthenticationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerAzureADOnlyAuthentication(String name, ServerAzureADOnlyAuthenticationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADOnlyAuthentication", name, args == null ? ServerAzureADOnlyAuthenticationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServerAzureADOnlyAuthentication(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADOnlyAuthentication", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:sql/v20200202preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200801preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20201101preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210201preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerAzureADOnlyAuthentication").build())
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
    public static ServerAzureADOnlyAuthentication get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerAzureADOnlyAuthentication(name, id, options);
    }
}
