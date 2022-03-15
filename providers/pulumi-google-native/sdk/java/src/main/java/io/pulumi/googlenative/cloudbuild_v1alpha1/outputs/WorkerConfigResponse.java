// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudbuild_v1alpha1.outputs.NetworkResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerConfigResponse {
    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
     * 
     */
    private final String diskSizeGb;
    /**
     * Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
     * 
     */
    private final String machineType;
    /**
     * The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
     * 
     */
    private final NetworkResponse network;
    /**
     * The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
     * 
     */
    private final String tag;

    @CustomType.Constructor
    private WorkerConfigResponse(
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("network") NetworkResponse network,
        @CustomType.Parameter("tag") String tag) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
        this.network = network;
        this.tag = tag;
    }

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
     * 
    */
    public NetworkResponse getNetwork() {
        return this.network;
    }
    /**
     * The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
     * 
    */
    public String getTag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private String machineType;
        private NetworkResponse network;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.network = defaults.network;
    	      this.tag = defaults.tag;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder network(NetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public WorkerConfigResponse build() {
            return new WorkerConfigResponse(diskSizeGb, machineType, network, tag);
        }
    }
}
