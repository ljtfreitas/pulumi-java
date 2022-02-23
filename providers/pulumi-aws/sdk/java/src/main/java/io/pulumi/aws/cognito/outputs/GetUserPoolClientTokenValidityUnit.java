// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUserPoolClientTokenValidityUnit {
    /**
     * (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    private final String accessToken;
    /**
     * (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    private final String idToken;
    /**
     * (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    private final String refreshToken;

    @OutputCustomType.Constructor({"accessToken","idToken","refreshToken"})
    private GetUserPoolClientTokenValidityUnit(
        String accessToken,
        String idToken,
        String refreshToken) {
        this.accessToken = Objects.requireNonNull(accessToken);
        this.idToken = Objects.requireNonNull(idToken);
        this.refreshToken = Objects.requireNonNull(refreshToken);
    }

    /**
     * (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    public String getIdToken() {
        return this.idToken;
    }
    /**
     * (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientTokenValidityUnit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private String idToken;
        private String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientTokenValidityUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }

        public Builder setIdToken(String idToken) {
            this.idToken = Objects.requireNonNull(idToken);
            return this;
        }

        public Builder setRefreshToken(String refreshToken) {
            this.refreshToken = Objects.requireNonNull(refreshToken);
            return this;
        }
        public GetUserPoolClientTokenValidityUnit build() {
            return new GetUserPoolClientTokenValidityUnit(accessToken, idToken, refreshToken);
        }
    }
}
