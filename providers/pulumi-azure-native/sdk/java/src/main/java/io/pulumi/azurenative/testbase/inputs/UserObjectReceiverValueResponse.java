// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The user object receiver value.
 * 
 */
public final class UserObjectReceiverValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserObjectReceiverValueResponse Empty = new UserObjectReceiverValueResponse();

    /**
     * user object ids.
     * 
     */
    @Import(name="userObjectIds")
      private final @Nullable List<String> userObjectIds;

    public List<String> getUserObjectIds() {
        return this.userObjectIds == null ? List.of() : this.userObjectIds;
    }

    public UserObjectReceiverValueResponse(@Nullable List<String> userObjectIds) {
        this.userObjectIds = userObjectIds;
    }

    private UserObjectReceiverValueResponse() {
        this.userObjectIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserObjectReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> userObjectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(UserObjectReceiverValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userObjectIds = defaults.userObjectIds;
        }

        public Builder userObjectIds(@Nullable List<String> userObjectIds) {
            this.userObjectIds = userObjectIds;
            return this;
        }
        public UserObjectReceiverValueResponse build() {
            return new UserObjectReceiverValueResponse(userObjectIds);
        }
    }
}
