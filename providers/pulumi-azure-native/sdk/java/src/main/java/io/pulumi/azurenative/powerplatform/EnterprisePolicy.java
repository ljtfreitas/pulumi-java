// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerplatform.EnterprisePolicyArgs;
import io.pulumi.azurenative.powerplatform.outputs.EnterprisePolicyIdentityResponse;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseEncryption;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseLockbox;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseNetworkInjection;
import io.pulumi.azurenative.powerplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the EnterprisePolicy.
 * API Version: 2020-10-30-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:powerplatform:EnterprisePolicy enterprisePolicy /subscriptions/subid/resourceGroups/resourceGroup/providers/Microsoft.PowerPlatform/enterprisePolicies/enterprisePolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:powerplatform:EnterprisePolicy")
public class EnterprisePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The encryption settings for a configuration store.
     * 
     */
    @Export(name="encryption", type=PropertiesResponseEncryption.class, parameters={})
    private Output</* @Nullable */ PropertiesResponseEncryption> encryption;

    /**
     * @return The encryption settings for a configuration store.
     * 
     */
    public Output</* @Nullable */ PropertiesResponseEncryption> getEncryption() {
        return this.encryption;
    }
    /**
     * The identity of the EnterprisePolicy.
     * 
     */
    @Export(name="identity", type=EnterprisePolicyIdentityResponse.class, parameters={})
    private Output</* @Nullable */ EnterprisePolicyIdentityResponse> identity;

    /**
     * @return The identity of the EnterprisePolicy.
     * 
     */
    public Output</* @Nullable */ EnterprisePolicyIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The kind (type) of Enterprise Policy.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind (type) of Enterprise Policy.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Settings concerning lockbox.
     * 
     */
    @Export(name="lockbox", type=PropertiesResponseLockbox.class, parameters={})
    private Output</* @Nullable */ PropertiesResponseLockbox> lockbox;

    /**
     * @return Settings concerning lockbox.
     * 
     */
    public Output</* @Nullable */ PropertiesResponseLockbox> getLockbox() {
        return this.lockbox;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Settings concerning network injection.
     * 
     */
    @Export(name="networkInjection", type=PropertiesResponseNetworkInjection.class, parameters={})
    private Output</* @Nullable */ PropertiesResponseNetworkInjection> networkInjection;

    /**
     * @return Settings concerning network injection.
     * 
     */
    public Output</* @Nullable */ PropertiesResponseNetworkInjection> getNetworkInjection() {
        return this.networkInjection;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(EnterprisePolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.powerplatform.EnterprisePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.powerplatform.EnterprisePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnterprisePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterprisePolicy(String name) {
        this(name, EnterprisePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterprisePolicy(String name, EnterprisePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterprisePolicy(String name, EnterprisePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerplatform:EnterprisePolicy", name, args == null ? EnterprisePolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EnterprisePolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerplatform:EnterprisePolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:powerplatform/v20201030preview:EnterprisePolicy").build())
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
    public static EnterprisePolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnterprisePolicy(name, id, options);
    }
}
