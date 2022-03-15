// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.FhirServiceArgs;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAccessPolicyEntryResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAcrConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAuthenticationConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceCorsConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceExportConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceManagedIdentityResponseIdentity;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The description of Fhir Service
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:healthcareapis:FhirService fhirservice1 /subscriptions/subid/resourceGroups/testRG/providers/Microsoft.HealthcareApis/workspaces/workspace1/fhirservices/fhirservice1 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthcareapis:FhirService")
public class FhirService extends io.pulumi.resources.CustomResource {
    /**
     * Fhir Service access policies.
     * 
     */
    @Export(name="accessPolicies", type=List.class, parameters={FhirServiceAccessPolicyEntryResponse.class})
    private Output</* @Nullable */ List<FhirServiceAccessPolicyEntryResponse>> accessPolicies;

    /**
     * @return Fhir Service access policies.
     * 
     */
    public Output</* @Nullable */ List<FhirServiceAccessPolicyEntryResponse>> getAccessPolicies() {
        return this.accessPolicies;
    }
    /**
     * Fhir Service Azure container registry configuration.
     * 
     */
    @Export(name="acrConfiguration", type=FhirServiceAcrConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceAcrConfigurationResponse> acrConfiguration;

    /**
     * @return Fhir Service Azure container registry configuration.
     * 
     */
    public Output</* @Nullable */ FhirServiceAcrConfigurationResponse> getAcrConfiguration() {
        return this.acrConfiguration;
    }
    /**
     * Fhir Service authentication configuration.
     * 
     */
    @Export(name="authenticationConfiguration", type=FhirServiceAuthenticationConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceAuthenticationConfigurationResponse> authenticationConfiguration;

    /**
     * @return Fhir Service authentication configuration.
     * 
     */
    public Output</* @Nullable */ FhirServiceAuthenticationConfigurationResponse> getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * Fhir Service Cors configuration.
     * 
     */
    @Export(name="corsConfiguration", type=FhirServiceCorsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceCorsConfigurationResponse> corsConfiguration;

    /**
     * @return Fhir Service Cors configuration.
     * 
     */
    public Output</* @Nullable */ FhirServiceCorsConfigurationResponse> getCorsConfiguration() {
        return this.corsConfiguration;
    }
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
     * Fhir Service export configuration.
     * 
     */
    @Export(name="exportConfiguration", type=FhirServiceExportConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceExportConfigurationResponse> exportConfiguration;

    /**
     * @return Fhir Service export configuration.
     * 
     */
    public Output</* @Nullable */ FhirServiceExportConfigurationResponse> getExportConfiguration() {
        return this.exportConfiguration;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Export(name="identity", type=ServiceManagedIdentityResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> getIdentity() {
        return this.identity;
    }
    /**
     * The kind of the service.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The kind of the service.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
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
     * The provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
        public void apply(FhirServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.healthcareapis.FhirServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.healthcareapis.FhirServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FhirService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FhirService(String name) {
        this(name, FhirServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FhirService(String name, FhirServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FhirService(String name, FhirServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:FhirService", name, args == null ? FhirServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FhirService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:FhirService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:healthcareapis/v20210601preview:FhirService").build())
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
    public static FhirService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FhirService(name, id, options);
    }
}
