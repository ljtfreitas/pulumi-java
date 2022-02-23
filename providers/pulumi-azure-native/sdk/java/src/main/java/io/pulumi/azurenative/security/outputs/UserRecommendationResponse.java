// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserRecommendationResponse {
    /**
     * The recommendation action of the machine or rule
     * 
     */
    private final @Nullable String recommendationAction;
    /**
     * Represents a user that is recommended to be allowed for a certain rule
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"recommendationAction","username"})
    private UserRecommendationResponse(
        @Nullable String recommendationAction,
        @Nullable String username) {
        this.recommendationAction = recommendationAction;
        this.username = username;
    }

    /**
     * The recommendation action of the machine or rule
     * 
     */
    public Optional<String> getRecommendationAction() {
        return Optional.ofNullable(this.recommendationAction);
    }
    /**
     * Represents a user that is recommended to be allowed for a certain rule
     * 
     */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserRecommendationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recommendationAction;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserRecommendationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recommendationAction = defaults.recommendationAction;
    	      this.username = defaults.username;
        }

        public Builder setRecommendationAction(@Nullable String recommendationAction) {
            this.recommendationAction = recommendationAction;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public UserRecommendationResponse build() {
            return new UserRecommendationResponse(recommendationAction, username);
        }
    }
}
