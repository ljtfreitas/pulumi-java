// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * controller details
 * 
 */
public final class ControllerDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ControllerDetailsResponse Empty = new ControllerDetailsResponse();

    /**
     * controller arm resource id
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public ControllerDetailsResponse(@Nullable String id) {
        this.id = id;
    }

    private ControllerDetailsResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControllerDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ControllerDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public ControllerDetailsResponse build() {
            return new ControllerDetailsResponse(id);
        }
    }
}
