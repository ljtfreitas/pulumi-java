// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerAccessLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogsArgs Empty = new LoadBalancerAccessLogsArgs();

    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public LoadBalancerAccessLogsArgs(
        Input<String> bucket,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.enabled = enabled;
        this.prefix = prefix;
    }

    private LoadBalancerAccessLogsArgs() {
        this.bucket = Input.empty();
        this.enabled = Input.empty();
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }
        public LoadBalancerAccessLogsArgs build() {
            return new LoadBalancerAccessLogsArgs(bucket, enabled, prefix);
        }
    }
}
