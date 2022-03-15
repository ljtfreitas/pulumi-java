// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.AFDCustomDomainArgs;
import io.pulumi.azurenative.cdn.outputs.AFDDomainHttpsParametersResponse;
import io.pulumi.azurenative.cdn.outputs.DomainValidationPropertiesResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:AFDCustomDomain domain1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/domains/domain1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:AFDCustomDomain")
public class AFDCustomDomain extends io.pulumi.resources.CustomResource {
    /**
     * Resource reference to the Azure DNS zone
     * 
     */
    @Export(name="azureDnsZone", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> azureDnsZone;

    /**
     * @return Resource reference to the Azure DNS zone
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getAzureDnsZone() {
        return this.azureDnsZone;
    }
    @Export(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     */
    @Export(name="domainValidationState", type=String.class, parameters={})
    private Output<String> domainValidationState;

    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     */
    public Output<String> getDomainValidationState() {
        return this.domainValidationState;
    }
    /**
     * The host name of the domain. Must be a domain name.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name of the domain. Must be a domain name.
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
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
     * Provisioning status
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
     */
    @Export(name="tlsSettings", type=AFDDomainHttpsParametersResponse.class, parameters={})
    private Output</* @Nullable */ AFDDomainHttpsParametersResponse> tlsSettings;

    /**
     * @return The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
     */
    public Output</* @Nullable */ AFDDomainHttpsParametersResponse> getTlsSettings() {
        return this.tlsSettings;
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
    /**
     * Values the customer needs to validate domain ownership
     * 
     */
    @Export(name="validationProperties", type=DomainValidationPropertiesResponse.class, parameters={})
    private Output<DomainValidationPropertiesResponse> validationProperties;

    /**
     * @return Values the customer needs to validate domain ownership
     * 
     */
    public Output<DomainValidationPropertiesResponse> getValidationProperties() {
        return this.validationProperties;
    }

    public interface BuilderApplicator {
        public void apply(AFDCustomDomainArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.AFDCustomDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.AFDCustomDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AFDCustomDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AFDCustomDomain(String name) {
        this(name, AFDCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AFDCustomDomain(String name, AFDCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AFDCustomDomain(String name, AFDCustomDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDCustomDomain", name, args == null ? AFDCustomDomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AFDCustomDomain(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDCustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:cdn/v20200901:AFDCustomDomain").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20210601:AFDCustomDomain").build())
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
    public static AFDCustomDomain get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AFDCustomDomain(name, id, options);
    }
}
