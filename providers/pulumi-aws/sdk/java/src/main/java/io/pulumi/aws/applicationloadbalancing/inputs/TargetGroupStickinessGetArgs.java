// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupStickinessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGroupStickinessGetArgs Empty = new TargetGroupStickinessGetArgs();

    /**
     * Only used when the type is `lb_cookie`. The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * 
     */
    @InputImport(name="cookieDuration")
    private final @Nullable Input<Integer> cookieDuration;

    public Input<Integer> getCookieDuration() {
        return this.cookieDuration == null ? Input.empty() : this.cookieDuration;
    }

    /**
     * Name of the application based cookie. AWSALB, AWSALBAPP, and AWSALBTG prefixes are reserved and cannot be used. Only needed when type is `app_cookie`.
     * 
     */
    @InputImport(name="cookieName")
    private final @Nullable Input<String> cookieName;

    public Input<String> getCookieName() {
        return this.cookieName == null ? Input.empty() : this.cookieName;
    }

    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The type of sticky sessions. The only current possible values are `lb_cookie`, `app_cookie` for ALBs, and `source_ip` for NLBs.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TargetGroupStickinessGetArgs(
        @Nullable Input<Integer> cookieDuration,
        @Nullable Input<String> cookieName,
        @Nullable Input<Boolean> enabled,
        Input<String> type) {
        this.cookieDuration = cookieDuration;
        this.cookieName = cookieName;
        this.enabled = enabled;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TargetGroupStickinessGetArgs() {
        this.cookieDuration = Input.empty();
        this.cookieName = Input.empty();
        this.enabled = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupStickinessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cookieDuration;
        private @Nullable Input<String> cookieName;
        private @Nullable Input<Boolean> enabled;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupStickinessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieDuration = defaults.cookieDuration;
    	      this.cookieName = defaults.cookieName;
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
        }

        public Builder setCookieDuration(@Nullable Input<Integer> cookieDuration) {
            this.cookieDuration = cookieDuration;
            return this;
        }

        public Builder setCookieDuration(@Nullable Integer cookieDuration) {
            this.cookieDuration = Input.ofNullable(cookieDuration);
            return this;
        }

        public Builder setCookieName(@Nullable Input<String> cookieName) {
            this.cookieName = cookieName;
            return this;
        }

        public Builder setCookieName(@Nullable String cookieName) {
            this.cookieName = Input.ofNullable(cookieName);
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TargetGroupStickinessGetArgs build() {
            return new TargetGroupStickinessGetArgs(cookieDuration, cookieName, enabled, type);
        }
    }
}
