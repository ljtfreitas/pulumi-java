// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionRegisteredFeaturesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubscriptionRegisteredFeaturesResponse Empty = new SubscriptionRegisteredFeaturesResponse();

    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public SubscriptionRegisteredFeaturesResponse(
        @Nullable String name,
        @Nullable String state) {
        this.name = name;
        this.state = state;
    }

    private SubscriptionRegisteredFeaturesResponse() {
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionRegisteredFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionRegisteredFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public SubscriptionRegisteredFeaturesResponse build() {
            return new SubscriptionRegisteredFeaturesResponse(name, state);
        }
    }
}
