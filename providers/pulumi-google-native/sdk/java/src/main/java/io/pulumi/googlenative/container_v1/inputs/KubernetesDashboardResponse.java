// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for the Kubernetes Dashboard.
 * 
 */
public final class KubernetesDashboardResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesDashboardResponse Empty = new KubernetesDashboardResponse();

    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
     */
    @InputImport(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public KubernetesDashboardResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private KubernetesDashboardResponse() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesDashboardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesDashboardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public KubernetesDashboardResponse build() {
            return new KubernetesDashboardResponse(disabled);
        }
    }
}
