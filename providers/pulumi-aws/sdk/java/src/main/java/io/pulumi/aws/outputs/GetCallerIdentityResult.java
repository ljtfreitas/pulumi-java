// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCallerIdentityResult {
    /**
     * AWS Account ID number of the account that owns or contains the calling entity.
     * 
     */
    private final String accountId;
    /**
     * ARN associated with the calling entity.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Unique identifier of the calling entity.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetCallerIdentityResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("userId") String userId) {
        this.accountId = accountId;
        this.arn = arn;
        this.id = id;
        this.userId = userId;
    }

    /**
     * AWS Account ID number of the account that owns or contains the calling entity.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * ARN associated with the calling entity.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Unique identifier of the calling entity.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCallerIdentityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String arn;
        private String id;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCallerIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.userId = defaults.userId;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetCallerIdentityResult build() {
            return new GetCallerIdentityResult(accountId, arn, id, userId);
        }
    }
}
