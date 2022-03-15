// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Kubernetes Dashboard.
 * 
 */
public final class KubernetesDashboardArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubernetesDashboardArgs Empty = new KubernetesDashboardArgs();

    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    public KubernetesDashboardArgs(@Nullable Output<Boolean> disabled) {
        this.disabled = disabled;
    }

    private KubernetesDashboardArgs() {
        this.disabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesDashboardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public KubernetesDashboardArgs build() {
            return new KubernetesDashboardArgs(disabled);
        }
    }
}
