// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UserObjectReceiverValueResponse {
    /**
     * user object ids.
     * 
     */
    private final @Nullable List<String> userObjectIds;

    @CustomType.Constructor
    private UserObjectReceiverValueResponse(@CustomType.Parameter("userObjectIds") @Nullable List<String> userObjectIds) {
        this.userObjectIds = userObjectIds;
    }

    /**
     * user object ids.
     * 
    */
    public List<String> getUserObjectIds() {
        return this.userObjectIds == null ? List.of() : this.userObjectIds;
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
