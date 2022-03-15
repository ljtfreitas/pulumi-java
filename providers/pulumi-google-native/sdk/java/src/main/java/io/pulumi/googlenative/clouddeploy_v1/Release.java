// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.clouddeploy_v1.ReleaseArgs;
import io.pulumi.googlenative.clouddeploy_v1.outputs.BuildArtifactResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.DeliveryPipelineResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.TargetResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Release in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:clouddeploy/v1:Release")
public class Release extends io.pulumi.resources.CustomResource {
    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Output<Map<String,String>> getAnnotations() {
        return this.annotations;
    }
    /**
     * List of artifacts to pass through to Skaffold command.
     * 
     */
    @Export(name="buildArtifacts", type=List.class, parameters={BuildArtifactResponse.class})
    private Output<List<BuildArtifactResponse>> buildArtifacts;

    /**
     * @return List of artifacts to pass through to Skaffold command.
     * 
     */
    public Output<List<BuildArtifactResponse>> getBuildArtifacts() {
        return this.buildArtifacts;
    }
    /**
     * Time at which the `Release` was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the `Release` was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Snapshot of the parent pipeline taken at release creation time.
     * 
     */
    @Export(name="deliveryPipelineSnapshot", type=DeliveryPipelineResponse.class, parameters={})
    private Output<DeliveryPipelineResponse> deliveryPipelineSnapshot;

    /**
     * @return Snapshot of the parent pipeline taken at release creation time.
     * 
     */
    public Output<DeliveryPipelineResponse> getDeliveryPipelineSnapshot() {
        return this.deliveryPipelineSnapshot;
    }
    /**
     * Description of the `Release`. Max length is 255 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the `Release`. Max length is 255 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Name of the `Release`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/a-z{0,62}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. Name of the `Release`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/a-z{0,62}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Time at which the render completed.
     * 
     */
    @Export(name="renderEndTime", type=String.class, parameters={})
    private Output<String> renderEndTime;

    /**
     * @return Time at which the render completed.
     * 
     */
    public Output<String> getRenderEndTime() {
        return this.renderEndTime;
    }
    /**
     * Time at which the render began.
     * 
     */
    @Export(name="renderStartTime", type=String.class, parameters={})
    private Output<String> renderStartTime;

    /**
     * @return Time at which the render began.
     * 
     */
    public Output<String> getRenderStartTime() {
        return this.renderStartTime;
    }
    /**
     * Current state of the render operation.
     * 
     */
    @Export(name="renderState", type=String.class, parameters={})
    private Output<String> renderState;

    /**
     * @return Current state of the render operation.
     * 
     */
    public Output<String> getRenderState() {
        return this.renderState;
    }
    /**
     * Filepath of the Skaffold config inside of the config URI.
     * 
     */
    @Export(name="skaffoldConfigPath", type=String.class, parameters={})
    private Output<String> skaffoldConfigPath;

    /**
     * @return Filepath of the Skaffold config inside of the config URI.
     * 
     */
    public Output<String> getSkaffoldConfigPath() {
        return this.skaffoldConfigPath;
    }
    /**
     * Cloud Storage URI of tar.gz archive containing Skaffold configuration.
     * 
     */
    @Export(name="skaffoldConfigUri", type=String.class, parameters={})
    private Output<String> skaffoldConfigUri;

    /**
     * @return Cloud Storage URI of tar.gz archive containing Skaffold configuration.
     * 
     */
    public Output<String> getSkaffoldConfigUri() {
        return this.skaffoldConfigUri;
    }
    /**
     * The Skaffold version to use when operating on this release, such as "1.20.0". Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
     * 
     */
    @Export(name="skaffoldVersion", type=String.class, parameters={})
    private Output<String> skaffoldVersion;

    /**
     * @return The Skaffold version to use when operating on this release, such as "1.20.0". Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
     * 
     */
    public Output<String> getSkaffoldVersion() {
        return this.skaffoldVersion;
    }
    /**
     * Map from target ID to the target artifacts created during the render operation.
     * 
     */
    @Export(name="targetArtifacts", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> targetArtifacts;

    /**
     * @return Map from target ID to the target artifacts created during the render operation.
     * 
     */
    public Output<Map<String,String>> getTargetArtifacts() {
        return this.targetArtifacts;
    }
    /**
     * Map from target ID to details of the render operation for that target.
     * 
     */
    @Export(name="targetRenders", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> targetRenders;

    /**
     * @return Map from target ID to details of the render operation for that target.
     * 
     */
    public Output<Map<String,String>> getTargetRenders() {
        return this.targetRenders;
    }
    /**
     * Snapshot of the targets taken at release creation time.
     * 
     */
    @Export(name="targetSnapshots", type=List.class, parameters={TargetResponse.class})
    private Output<List<TargetResponse>> targetSnapshots;

    /**
     * @return Snapshot of the targets taken at release creation time.
     * 
     */
    public Output<List<TargetResponse>> getTargetSnapshots() {
        return this.targetSnapshots;
    }
    /**
     * Unique identifier of the `Release`.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Unique identifier of the `Release`.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }

    public interface BuilderApplicator {
        public void apply(ReleaseArgs.Builder a);
    }
    private static io.pulumi.googlenative.clouddeploy_v1.ReleaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.clouddeploy_v1.ReleaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Release(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Release(String name) {
        this(name, ReleaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Release(String name, ReleaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Release(String name, ReleaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:clouddeploy/v1:Release", name, args == null ? ReleaseArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Release(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:clouddeploy/v1:Release", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Release get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Release(name, id, options);
    }
}
