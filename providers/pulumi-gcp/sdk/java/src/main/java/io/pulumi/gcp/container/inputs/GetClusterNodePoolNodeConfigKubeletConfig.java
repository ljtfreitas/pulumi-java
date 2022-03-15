// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfigKubeletConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfigKubeletConfig Empty = new GetClusterNodePoolNodeConfigKubeletConfig();

    @Import(name="cpuCfsQuota", required=true)
      private final Boolean cpuCfsQuota;

    public Boolean getCpuCfsQuota() {
        return this.cpuCfsQuota;
    }

    @Import(name="cpuCfsQuotaPeriod", required=true)
      private final String cpuCfsQuotaPeriod;

    public String getCpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }

    @Import(name="cpuManagerPolicy", required=true)
      private final String cpuManagerPolicy;

    public String getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public GetClusterNodePoolNodeConfigKubeletConfig(
        Boolean cpuCfsQuota,
        String cpuCfsQuotaPeriod,
        String cpuManagerPolicy) {
        this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota, "expected parameter 'cpuCfsQuota' to be non-null");
        this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod, "expected parameter 'cpuCfsQuotaPeriod' to be non-null");
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
    }

    private GetClusterNodePoolNodeConfigKubeletConfig() {
        this.cpuCfsQuota = null;
        this.cpuCfsQuotaPeriod = null;
        this.cpuManagerPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota);
            return this;
        }

        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod);
            return this;
        }

        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        public GetClusterNodePoolNodeConfigKubeletConfig build() {
            return new GetClusterNodePoolNodeConfigKubeletConfig(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
