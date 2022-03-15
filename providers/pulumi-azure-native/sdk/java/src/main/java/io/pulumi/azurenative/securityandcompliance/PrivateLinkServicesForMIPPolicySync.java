// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityandcompliance.PrivateLinkServicesForMIPPolicySyncArgs;
import io.pulumi.azurenative.securityandcompliance.outputs.ServicesPropertiesResponse;
import io.pulumi.azurenative.securityandcompliance.outputs.ServicesResourceResponseIdentity;
import io.pulumi.azurenative.securityandcompliance.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The description of the service.
 * API Version: 2021-03-08.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityandcompliance:privateLinkServicesForMIPPolicySync service2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.SecurityAndCompliance/privateLinkServicesForMIPPolicySync/service2 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityandcompliance:privateLinkServicesForMIPPolicySync")
public class PrivateLinkServicesForMIPPolicySync extends io.pulumi.resources.CustomResource {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Export(name="identity", type=ServicesResourceResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServicesResourceResponseIdentity> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Output</* @Nullable */ ServicesResourceResponseIdentity> getIdentity() {
        return this.identity;
    }
    /**
     * The kind of the service.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the service.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The common properties of a service.
     * 
     */
    @Export(name="properties", type=ServicesPropertiesResponse.class, parameters={})
    private Output<ServicesPropertiesResponse> properties;

    /**
     * @return The common properties of a service.
     * 
     */
    public Output<ServicesPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Required property for system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Required property for system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PrivateLinkServicesForMIPPolicySyncArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityandcompliance.PrivateLinkServicesForMIPPolicySyncArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityandcompliance.PrivateLinkServicesForMIPPolicySyncArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrivateLinkServicesForMIPPolicySync(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkServicesForMIPPolicySync(String name) {
        this(name, PrivateLinkServicesForMIPPolicySyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkServicesForMIPPolicySync(String name, PrivateLinkServicesForMIPPolicySyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkServicesForMIPPolicySync(String name, PrivateLinkServicesForMIPPolicySyncArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:privateLinkServicesForMIPPolicySync", name, args == null ? PrivateLinkServicesForMIPPolicySyncArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PrivateLinkServicesForMIPPolicySync(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:privateLinkServicesForMIPPolicySync", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:securityandcompliance/v20210308:privateLinkServicesForMIPPolicySync").build())
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
    public static PrivateLinkServicesForMIPPolicySync get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkServicesForMIPPolicySync(name, id, options);
    }
}
