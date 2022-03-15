// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.DscConfigurationArgs;
import io.pulumi.azurenative.automation.outputs.ContentSourceResponse;
import io.pulumi.azurenative.automation.outputs.DscConfigurationParameterResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the configuration type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:DscConfiguration SetupServer /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount33/configurations/SetupServer 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:DscConfiguration")
public class DscConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Gets or sets the job count of the configuration.
     * 
     */
    @Export(name="jobCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> jobCount;

    /**
     * @return Gets or sets the job count of the configuration.
     * 
     */
    public Output</* @Nullable */ Integer> getJobCount() {
        return this.jobCount;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets verbose log option.
     * 
     */
    @Export(name="logVerbose", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> logVerbose;

    /**
     * @return Gets or sets verbose log option.
     * 
     */
    public Output</* @Nullable */ Boolean> getLogVerbose() {
        return this.logVerbose;
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
     * Gets the number of compiled node configurations.
     * 
     */
    @Export(name="nodeConfigurationCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> nodeConfigurationCount;

    /**
     * @return Gets the number of compiled node configurations.
     * 
     */
    public Output</* @Nullable */ Integer> getNodeConfigurationCount() {
        return this.nodeConfigurationCount;
    }
    /**
     * Gets or sets the configuration parameters.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, DscConfigurationParameterResponse.class})
    private Output</* @Nullable */ Map<String,DscConfigurationParameterResponse>> parameters;

    /**
     * @return Gets or sets the configuration parameters.
     * 
     */
    public Output</* @Nullable */ Map<String,DscConfigurationParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Gets or sets the provisioning state of the configuration.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Gets or sets the provisioning state of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the source.
     * 
     */
    @Export(name="source", type=ContentSourceResponse.class, parameters={})
    private Output</* @Nullable */ ContentSourceResponse> source;

    /**
     * @return Gets or sets the source.
     * 
     */
    public Output</* @Nullable */ ContentSourceResponse> getSource() {
        return this.source;
    }
    /**
     * Gets or sets the state of the configuration.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Gets or sets the state of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
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
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DscConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.automation.DscConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.automation.DscConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DscConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DscConfiguration(String name) {
        this(name, DscConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DscConfiguration(String name, DscConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DscConfiguration(String name, DscConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscConfiguration", name, args == null ? DscConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DscConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:automation/v20151031:DscConfiguration").build()),
                Output.of(Alias.builder().setType("azure-native:automation/v20190601:DscConfiguration").build())
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
    public static DscConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DscConfiguration(name, id, options);
    }
}
