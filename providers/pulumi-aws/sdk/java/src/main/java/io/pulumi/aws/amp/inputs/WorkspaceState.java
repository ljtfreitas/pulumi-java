// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceState extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceState Empty = new WorkspaceState();

    /**
     * The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
     * 
     */
    @InputImport(name="alias")
    private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * Amazon Resource Name (ARN) of the workspace.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Prometheus endpoint available for this workspace.
     * 
     */
    @InputImport(name="prometheusEndpoint")
    private final @Nullable Input<String> prometheusEndpoint;

    public Input<String> getPrometheusEndpoint() {
        return this.prometheusEndpoint == null ? Input.empty() : this.prometheusEndpoint;
    }

    public WorkspaceState(
        @Nullable Input<String> alias,
        @Nullable Input<String> arn,
        @Nullable Input<String> prometheusEndpoint) {
        this.alias = alias;
        this.arn = arn;
        this.prometheusEndpoint = prometheusEndpoint;
    }

    private WorkspaceState() {
        this.alias = Input.empty();
        this.arn = Input.empty();
        this.prometheusEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> prometheusEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setPrometheusEndpoint(@Nullable Input<String> prometheusEndpoint) {
            this.prometheusEndpoint = prometheusEndpoint;
            return this;
        }

        public Builder setPrometheusEndpoint(@Nullable String prometheusEndpoint) {
            this.prometheusEndpoint = Input.ofNullable(prometheusEndpoint);
            return this;
        }
        public WorkspaceState build() {
            return new WorkspaceState(alias, arn, prometheusEndpoint);
        }
    }
}
