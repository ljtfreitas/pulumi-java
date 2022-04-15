// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataflow.JobArgs;
import io.pulumi.gcp.dataflow.inputs.JobState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a job on Dataflow, which is an implementation of Apache Beam running on Google Compute Engine. For more information see
 * the official documentation for
 * [Beam](https://beam.apache.org) and [Dataflow](https://cloud.google.com/dataflow/).
 * 
 * ## Example Usage
 * ## Note on "destroy" / "apply"
 * 
 * There are many types of Dataflow jobs.  Some Dataflow jobs run constantly, getting new data from (e.g.) a GCS bucket, and outputting data continuously.  Some jobs process a set amount of data then terminate.  All jobs can fail while running due to programming errors or other issues.  In this way, Dataflow jobs are different from most other Google resources.
 * 
 * The Dataflow resource is considered 'existing' while it is in a nonterminal state.  If it reaches a terminal state (e.g. 'FAILED', 'COMPLETE', 'CANCELLED'), it will be recreated on the next 'apply'.  This is as expected for jobs which run continuously, but may surprise users who use this resource for other kinds of Dataflow jobs.
 * 
 * A Dataflow job which is 'destroyed' may be "cancelled" or "drained".  If "cancelled", the job terminates - any data written remains where it is, but no new data will be processed.  If "drained", no new data will enter the pipeline, but any data currently in the pipeline will finish being processed.  The default is "drain". When `on_delete` is set to `"drain"` in the configuration, you may experience a long wait for your `pulumi destroy` to complete.
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:dataflow/job:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
     * 
     */
    @Export(name="additionalExperiments", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalExperiments;

    /**
     * @return List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
     * 
     */
    public Output</* @Nullable */ List<String>> additionalExperiments() {
        return this.additionalExperiments;
    }
    /**
     * Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    @Export(name="enableStreamingEngine", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStreamingEngine;

    /**
     * @return Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    public Output</* @Nullable */ Boolean> enableStreamingEngine() {
        return this.enableStreamingEngine;
    }
    /**
     * The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
     * 
     */
    @Export(name="ipConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipConfiguration;

    /**
     * @return The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
     * 
     */
    public Output</* @Nullable */ String> ipConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * The unique ID of this job.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The unique ID of this job.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    public Output</* @Nullable */ String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * <<<<<<< HEAD
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * <<<<<<< HEAD
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The machine type to use for the job.
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> machineType;

    /**
     * @return The machine type to use for the job.
     * 
     */
    public Output</* @Nullable */ String> machineType() {
        return this.machineType;
    }
    /**
     * The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    @Export(name="maxWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxWorkers;

    /**
     * @return The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    public Output</* @Nullable */ Integer> maxWorkers() {
        return this.maxWorkers;
    }
    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by Dataflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network to which VMs will be assigned. If it is not provided, "default" will be used.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The network to which VMs will be assigned. If it is not provided, "default" will be used.
     * 
     */
    public Output</* @Nullable */ String> network() {
        return this.network;
    }
    /**
     * One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Export(name="onDelete", type=String.class, parameters={})
    private Output</* @Nullable */ String> onDelete;

    /**
     * @return One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    public Output</* @Nullable */ String> onDelete() {
        return this.onDelete;
    }
    /**
     * Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> parameters;

    /**
     * @return Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> parameters() {
        return this.parameters;
    }
    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the created job should run.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region in which the created job should run.
     * 
     */
    public Output</* @Nullable */ String> region() {
        return this.region;
    }
    /**
     * The Service Account email used to create the job.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccountEmail;

    /**
     * @return The Service Account email used to create the job.
     * 
     */
    public Output</* @Nullable */ String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetwork;

    /**
     * @return The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
     * 
     */
    public Output</* @Nullable */ String> subnetwork() {
        return this.subnetwork;
    }
    /**
     * A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    @Export(name="tempGcsLocation", type=String.class, parameters={})
    private Output<String> tempGcsLocation;

    /**
     * @return A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    public Output<String> tempGcsLocation() {
        return this.tempGcsLocation;
    }
    /**
     * The GCS path to the Dataflow job template.
     * 
     */
    @Export(name="templateGcsPath", type=String.class, parameters={})
    private Output<String> templateGcsPath;

    /**
     * @return The GCS path to the Dataflow job template.
     * 
     */
    public Output<String> templateGcsPath() {
        return this.templateGcsPath;
    }
    /**
     * Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * > > > > > > > v4.1.0
     * 
     */
    @Export(name="transformNameMapping", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> transformNameMapping;

    /**
     * @return Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * > > > > > > > v4.1.0
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> transformNameMapping() {
        return this.transformNameMapping;
    }
    /**
     * The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    /**
     * @return The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    public Output</* @Nullable */ String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataflow/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataflow/job:Job", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
