// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse {
    /**
     * The accelerator card attached to each VM.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;
    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
     * 
     */
    private final String diskSizeGb;
    /**
     * Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
     * 
     */
    private final String diskType;
    /**
     * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
     * 
     */
    private final String machineType;
    /**
     * The maximum number of actions a worker can execute concurrently.
     * 
     */
    private final String maxConcurrentActions;
    /**
     * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
     * 
     */
    private final String minCpuPlatform;
    /**
     * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
     * 
     */
    private final String networkAccess;
    /**
     * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
     * 
     */
    private final Boolean reserved;
    /**
     * The node type name to be used for sole-tenant nodes.
     * 
     */
    private final String soleTenantNodeType;
    /**
     * The name of the image used by each VM.
     * 
     */
    private final String vmImage;

    @OutputCustomType.Constructor({"accelerator","diskSizeGb","diskType","labels","machineType","maxConcurrentActions","minCpuPlatform","networkAccess","reserved","soleTenantNodeType","vmImage"})
    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator,
        String diskSizeGb,
        String diskType,
        Map<String,String> labels,
        String machineType,
        String maxConcurrentActions,
        String minCpuPlatform,
        String networkAccess,
        Boolean reserved,
        String soleTenantNodeType,
        String vmImage) {
        this.accelerator = Objects.requireNonNull(accelerator);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
        this.labels = Objects.requireNonNull(labels);
        this.machineType = Objects.requireNonNull(machineType);
        this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions);
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
        this.networkAccess = Objects.requireNonNull(networkAccess);
        this.reserved = Objects.requireNonNull(reserved);
        this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType);
        this.vmImage = Objects.requireNonNull(vmImage);
    }

    /**
     * The accelerator card attached to each VM.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse getAccelerator() {
        return this.accelerator;
    }
    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
     * 
     */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
     * 
     */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The maximum number of actions a worker can execute concurrently.
     * 
     */
    public String getMaxConcurrentActions() {
        return this.maxConcurrentActions;
    }
    /**
     * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
     * 
     */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
     * 
     */
    public String getNetworkAccess() {
        return this.networkAccess;
    }
    /**
     * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
     * 
     */
    public Boolean getReserved() {
        return this.reserved;
    }
    /**
     * The node type name to be used for sole-tenant nodes.
     * 
     */
    public String getSoleTenantNodeType() {
        return this.soleTenantNodeType;
    }
    /**
     * The name of the image used by each VM.
     * 
     */
    public String getVmImage() {
        return this.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;
        private String diskSizeGb;
        private String diskType;
        private Map<String,String> labels;
        private String machineType;
        private String maxConcurrentActions;
        private String minCpuPlatform;
        private String networkAccess;
        private Boolean reserved;
        private String soleTenantNodeType;
        private String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerator = defaults.accelerator;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.maxConcurrentActions = defaults.maxConcurrentActions;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkAccess = defaults.networkAccess;
    	      this.reserved = defaults.reserved;
    	      this.soleTenantNodeType = defaults.soleTenantNodeType;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAccelerator(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator) {
            this.accelerator = Objects.requireNonNull(accelerator);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaxConcurrentActions(String maxConcurrentActions) {
            this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNetworkAccess(String networkAccess) {
            this.networkAccess = Objects.requireNonNull(networkAccess);
            return this;
        }

        public Builder setReserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }

        public Builder setSoleTenantNodeType(String soleTenantNodeType) {
            this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType);
            return this;
        }

        public Builder setVmImage(String vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(accelerator, diskSizeGb, diskType, labels, machineType, maxConcurrentActions, minCpuPlatform, networkAccess, reserved, soleTenantNodeType, vmImage);
        }
    }
}
