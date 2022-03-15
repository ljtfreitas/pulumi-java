// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigKubeletConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigKubeletConfigGetArgs Empty = new ClusterNodeConfigKubeletConfigGetArgs();

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
      private final @Nullable Output<Boolean> cpuCfsQuota;

    public Output<Boolean> getCpuCfsQuota() {
        return this.cpuCfsQuota == null ? Output.empty() : this.cpuCfsQuota;
    }

    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `"300ms"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m",
     * "h". The value must be a positive duration.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
      private final @Nullable Output<String> cpuCfsQuotaPeriod;

    public Output<String> getCpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Output.empty() : this.cpuCfsQuotaPeriod;
    }

    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `"none"` or `"static"`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    @Import(name="cpuManagerPolicy", required=true)
      private final Output<String> cpuManagerPolicy;

    public Output<String> getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public ClusterNodeConfigKubeletConfigGetArgs(
        @Nullable Output<Boolean> cpuCfsQuota,
        @Nullable Output<String> cpuCfsQuotaPeriod,
        Output<String> cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
    }

    private ClusterNodeConfigKubeletConfigGetArgs() {
        this.cpuCfsQuota = Output.empty();
        this.cpuCfsQuotaPeriod = Output.empty();
        this.cpuManagerPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cpuCfsQuota;
        private @Nullable Output<String> cpuCfsQuotaPeriod;
        private Output<String> cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Output.ofNullable(cpuCfsQuota);
            return this;
        }

        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Output.ofNullable(cpuCfsQuotaPeriod);
            return this;
        }

        public Builder cpuManagerPolicy(Output<String> cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }

        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Output.of(Objects.requireNonNull(cpuManagerPolicy));
            return this;
        }
        public ClusterNodeConfigKubeletConfigGetArgs build() {
            return new ClusterNodeConfigKubeletConfigGetArgs(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
