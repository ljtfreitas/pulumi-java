// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFargateProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFargateProfileArgs Empty = new GetFargateProfileArgs();

    /**
     * Name of the Cluster
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Name of FargateProfile
     * 
     */
    @InputImport(name="fargateProfileName", required=true)
        private final String fargateProfileName;

    public String getFargateProfileName() {
        return this.fargateProfileName;
    }

    public GetFargateProfileArgs(
        String clusterName,
        String fargateProfileName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.fargateProfileName = Objects.requireNonNull(fargateProfileName, "expected parameter 'fargateProfileName' to be non-null");
    }

    private GetFargateProfileArgs() {
        this.clusterName = null;
        this.fargateProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String fargateProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFargateProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.fargateProfileName = defaults.fargateProfileName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setFargateProfileName(String fargateProfileName) {
            this.fargateProfileName = Objects.requireNonNull(fargateProfileName);
            return this;
        }
        public GetFargateProfileArgs build() {
            return new GetFargateProfileArgs(clusterName, fargateProfileName);
        }
    }
}
