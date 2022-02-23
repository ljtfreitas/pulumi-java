// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message containing connection draining configuration.
 * 
 */
public final class ConnectionDrainingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionDrainingArgs Empty = new ConnectionDrainingArgs();

    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    @InputImport(name="drainingTimeoutSec")
      private final @Nullable Input<Integer> drainingTimeoutSec;

    public Input<Integer> getDrainingTimeoutSec() {
        return this.drainingTimeoutSec == null ? Input.empty() : this.drainingTimeoutSec;
    }

    public ConnectionDrainingArgs(@Nullable Input<Integer> drainingTimeoutSec) {
        this.drainingTimeoutSec = drainingTimeoutSec;
    }

    private ConnectionDrainingArgs() {
        this.drainingTimeoutSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionDrainingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> drainingTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionDrainingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainingTimeoutSec = defaults.drainingTimeoutSec;
        }

        public Builder setDrainingTimeoutSec(@Nullable Input<Integer> drainingTimeoutSec) {
            this.drainingTimeoutSec = drainingTimeoutSec;
            return this;
        }

        public Builder setDrainingTimeoutSec(@Nullable Integer drainingTimeoutSec) {
            this.drainingTimeoutSec = Input.ofNullable(drainingTimeoutSec);
            return this;
        }
        public ConnectionDrainingArgs build() {
            return new ConnectionDrainingArgs(drainingTimeoutSec);
        }
    }
}
