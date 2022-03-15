// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.appengine_v1beta.outputs.VolumeResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourcesResponse {
    /**
     * Number of CPU cores needed.
     * 
     */
    private final Double cpu;
    /**
     * Disk size (GB) needed.
     * 
     */
    private final Double diskGb;
    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    private final String kmsKeyReference;
    /**
     * Memory (GB) needed.
     * 
     */
    private final Double memoryGb;
    /**
     * User specified volumes.
     * 
     */
    private final List<VolumeResponse> volumes;

    @CustomType.Constructor
    private ResourcesResponse(
        @CustomType.Parameter("cpu") Double cpu,
        @CustomType.Parameter("diskGb") Double diskGb,
        @CustomType.Parameter("kmsKeyReference") String kmsKeyReference,
        @CustomType.Parameter("memoryGb") Double memoryGb,
        @CustomType.Parameter("volumes") List<VolumeResponse> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.kmsKeyReference = kmsKeyReference;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    /**
     * Number of CPU cores needed.
     * 
    */
    public Double getCpu() {
        return this.cpu;
    }
    /**
     * Disk size (GB) needed.
     * 
    */
    public Double getDiskGb() {
        return this.diskGb;
    }
    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
    */
    public String getKmsKeyReference() {
        return this.kmsKeyReference;
    }
    /**
     * Memory (GB) needed.
     * 
    */
    public Double getMemoryGb() {
        return this.memoryGb;
    }
    /**
     * User specified volumes.
     * 
    */
    public List<VolumeResponse> getVolumes() {
        return this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double diskGb;
        private String kmsKeyReference;
        private Double memoryGb;
        private List<VolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.kmsKeyReference = defaults.kmsKeyReference;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder diskGb(Double diskGb) {
            this.diskGb = Objects.requireNonNull(diskGb);
            return this;
        }

        public Builder kmsKeyReference(String kmsKeyReference) {
            this.kmsKeyReference = Objects.requireNonNull(kmsKeyReference);
            return this;
        }

        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder volumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public ResourcesResponse build() {
            return new ResourcesResponse(cpu, diskGb, kmsKeyReference, memoryGb, volumes);
        }
    }
}
