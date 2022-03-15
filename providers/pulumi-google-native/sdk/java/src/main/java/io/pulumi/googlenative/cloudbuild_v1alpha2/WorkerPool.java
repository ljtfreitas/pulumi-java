// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1alpha2.WorkerPoolArgs;
import io.pulumi.googlenative.cloudbuild_v1alpha2.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1alpha2.outputs.WorkerConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a `WorkerPool` to run the builds, and returns the new worker pool.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1alpha2:WorkerPool")
public class WorkerPool extends io.pulumi.resources.CustomResource {
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The resource name of the `WorkerPool`. Format of the name is `projects/{project_id}/workerPools/{worker_pool_id}`, where the value of {worker_pool_id} is provided in the CreateWorkerPool request.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the `WorkerPool`. Format of the name is `projects/{project_id}/workerPools/{worker_pool_id}`, where the value of {worker_pool_id} is provided in the CreateWorkerPool request.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    @Export(name="networkConfig", type=NetworkConfigResponse.class, parameters={})
    private Output<NetworkConfigResponse> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`.
     * 
     */
    public Output<NetworkConfigResponse> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * Immutable. The region where the `WorkerPool` runs. Only "us-central1" is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Immutable. The region where the `WorkerPool` runs. Only "us-central1" is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * WorkerPool state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return WorkerPool state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    @Export(name="workerConfig", type=WorkerConfigResponse.class, parameters={})
    private Output<WorkerConfigResponse> workerConfig;

    /**
     * @return Worker configuration for the `WorkerPool`.
     * 
     */
    public Output<WorkerConfigResponse> getWorkerConfig() {
        return this.workerConfig;
    }

    public interface BuilderApplicator {
        public void apply(WorkerPoolArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudbuild_v1alpha2.WorkerPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudbuild_v1alpha2.WorkerPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkerPool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1alpha2:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WorkerPool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1alpha2:WorkerPool", name, null, makeResourceOptions(options, id));
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
    public static WorkerPool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, options);
    }
}
