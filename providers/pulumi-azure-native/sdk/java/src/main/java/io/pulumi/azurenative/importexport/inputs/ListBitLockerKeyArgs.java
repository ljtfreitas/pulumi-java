// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListBitLockerKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListBitLockerKeyArgs Empty = new ListBitLockerKeyArgs();

    @InputImport(name="jobName", required=true)
    private final String jobName;

    public String getJobName() {
        return this.jobName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListBitLockerKeyArgs(
        String jobName,
        String resourceGroupName) {
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListBitLockerKeyArgs() {
        this.jobName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBitLockerKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBitLockerKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListBitLockerKeyArgs build() {
            return new ListBitLockerKeyArgs(jobName, resourceGroupName);
        }
    }
}