// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * describe the properties of a of a security standard object reference
 * 
 */
public final class AssignedStandardItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignedStandardItemResponse Empty = new AssignedStandardItemResponse();

    /**
     * full resourceId of the Microsoft.Security/standard object
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public AssignedStandardItemResponse(@Nullable String id) {
        this.id = id;
    }

    private AssignedStandardItemResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedStandardItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedStandardItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public AssignedStandardItemResponse build() {
            return new AssignedStandardItemResponse(id);
        }
    }
}
