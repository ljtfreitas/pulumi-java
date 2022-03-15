// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1alpha1.inputs.ContainerArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.VolumeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * InstanceSpec is a description of an instance.
 * 
 */
public final class InstanceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceSpecArgs Empty = new InstanceSpecArgs();

    /**
     * Optional. Optional duration in seconds the instance may be active relative to StartTime before the system will actively try to mark it failed and kill associated containers. If set to zero, the system will never attempt to kill an instance based on time. Otherwise, value must be a positive integer. +optional
     * 
     */
    @Import(name="activeDeadlineSeconds")
      private final @Nullable Output<String> activeDeadlineSeconds;

    public Output<String> getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Output.empty() : this.activeDeadlineSeconds;
    }

    /**
     * Optional. List of containers belonging to the instance. We disallow a number of fields on this Container. Only a single container may be provided.
     * 
     */
    @Import(name="containers")
      private final @Nullable Output<List<ContainerArgs>> containers;

    public Output<List<ContainerArgs>> getContainers() {
        return this.containers == null ? Output.empty() : this.containers;
    }

    /**
     * Optional. Restart policy for all containers within the instance. Allowed values are: - OnFailure: Instances will always be restarted on failure if the backoffLimit has not been reached. - Never: Instances are never restarted and all failures are permanent. Cannot be used if backoffLimit is set. +optional
     * 
     */
    @Import(name="restartPolicy")
      private final @Nullable Output<String> restartPolicy;

    public Output<String> getRestartPolicy() {
        return this.restartPolicy == null ? Output.empty() : this.restartPolicy;
    }

    /**
     * Optional. Email address of the IAM service account associated with the instance of a Job. The service account represents the identity of the running instance, and determines what permissions the instance has. If not provided, the instance will use the project's default service account. +optional
     * 
     */
    @Import(name="serviceAccountName")
      private final @Nullable Output<String> serviceAccountName;

    public Output<String> getServiceAccountName() {
        return this.serviceAccountName == null ? Output.empty() : this.serviceAccountName;
    }

    /**
     * Optional. Optional duration in seconds the instance needs to terminate gracefully. Value must be non-negative integer. The value zero indicates delete immediately. The grace period is the duration in seconds after the processes running in the instance are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. +optional
     * 
     */
    @Import(name="terminationGracePeriodSeconds")
      private final @Nullable Output<String> terminationGracePeriodSeconds;

    public Output<String> getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds == null ? Output.empty() : this.terminationGracePeriodSeconds;
    }

    /**
     * Optional. List of volumes that can be mounted by containers belonging to the instance. More info: https://kubernetes.io/docs/concepts/storage/volumes +optional
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<VolumeArgs>> volumes;

    public Output<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public InstanceSpecArgs(
        @Nullable Output<String> activeDeadlineSeconds,
        @Nullable Output<List<ContainerArgs>> containers,
        @Nullable Output<String> restartPolicy,
        @Nullable Output<String> serviceAccountName,
        @Nullable Output<String> terminationGracePeriodSeconds,
        @Nullable Output<List<VolumeArgs>> volumes) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.containers = containers;
        this.restartPolicy = restartPolicy;
        this.serviceAccountName = serviceAccountName;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.volumes = volumes;
    }

    private InstanceSpecArgs() {
        this.activeDeadlineSeconds = Output.empty();
        this.containers = Output.empty();
        this.restartPolicy = Output.empty();
        this.serviceAccountName = Output.empty();
        this.terminationGracePeriodSeconds = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDeadlineSeconds;
        private @Nullable Output<List<ContainerArgs>> containers;
        private @Nullable Output<String> restartPolicy;
        private @Nullable Output<String> serviceAccountName;
        private @Nullable Output<String> terminationGracePeriodSeconds;
        private @Nullable Output<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.containers = defaults.containers;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.volumes = defaults.volumes;
        }

        public Builder activeDeadlineSeconds(@Nullable Output<String> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        public Builder activeDeadlineSeconds(@Nullable String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Output.ofNullable(activeDeadlineSeconds);
            return this;
        }

        public Builder containers(@Nullable Output<List<ContainerArgs>> containers) {
            this.containers = containers;
            return this;
        }

        public Builder containers(@Nullable List<ContainerArgs> containers) {
            this.containers = Output.ofNullable(containers);
            return this;
        }

        public Builder restartPolicy(@Nullable Output<String> restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder restartPolicy(@Nullable String restartPolicy) {
            this.restartPolicy = Output.ofNullable(restartPolicy);
            return this;
        }

        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder serviceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = Output.ofNullable(serviceAccountName);
            return this;
        }

        public Builder terminationGracePeriodSeconds(@Nullable Output<String> terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public Builder terminationGracePeriodSeconds(@Nullable String terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = Output.ofNullable(terminationGracePeriodSeconds);
            return this;
        }

        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public InstanceSpecArgs build() {
            return new InstanceSpecArgs(activeDeadlineSeconds, containers, restartPolicy, serviceAccountName, terminationGracePeriodSeconds, volumes);
        }
    }
}
