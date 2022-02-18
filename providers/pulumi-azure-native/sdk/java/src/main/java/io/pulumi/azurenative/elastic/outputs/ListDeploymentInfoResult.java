// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListDeploymentInfoResult {
    /**
     * Disk capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String diskCapacity;
    /**
     * RAM capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String memoryCapacity;
    /**
     * The Elastic deployment status.
     * 
     */
    private final String status;
    /**
     * Version of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"diskCapacity","memoryCapacity","status","version"})
    private ListDeploymentInfoResult(
        String diskCapacity,
        String memoryCapacity,
        String status,
        String version) {
        this.diskCapacity = Objects.requireNonNull(diskCapacity);
        this.memoryCapacity = Objects.requireNonNull(memoryCapacity);
        this.status = Objects.requireNonNull(status);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Disk capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    public String getDiskCapacity() {
        return this.diskCapacity;
    }
    /**
     * RAM capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    public String getMemoryCapacity() {
        return this.memoryCapacity;
    }
    /**
     * The Elastic deployment status.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Version of the elasticsearch in Elastic cloud deployment.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeploymentInfoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskCapacity;
        private String memoryCapacity;
        private String status;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeploymentInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCapacity = defaults.diskCapacity;
    	      this.memoryCapacity = defaults.memoryCapacity;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder setDiskCapacity(String diskCapacity) {
            this.diskCapacity = Objects.requireNonNull(diskCapacity);
            return this;
        }

        public Builder setMemoryCapacity(String memoryCapacity) {
            this.memoryCapacity = Objects.requireNonNull(memoryCapacity);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public ListDeploymentInfoResult build() {
            return new ListDeploymentInfoResult(diskCapacity, memoryCapacity, status, version);
        }
    }
}
