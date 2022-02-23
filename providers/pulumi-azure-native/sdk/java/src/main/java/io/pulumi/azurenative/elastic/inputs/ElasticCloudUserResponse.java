// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the user's elastic account.
 * 
 */
public final class ElasticCloudUserResponse extends io.pulumi.resources.InvokeArgs {

    public static final ElasticCloudUserResponse Empty = new ElasticCloudUserResponse();

    /**
     * Elastic cloud default dashboard sso URL of the Elastic user account.
     * 
     */
    @InputImport(name="elasticCloudSsoDefaultUrl", required=true)
        private final String elasticCloudSsoDefaultUrl;

    public String getElasticCloudSsoDefaultUrl() {
        return this.elasticCloudSsoDefaultUrl;
    }

    /**
     * Email of the Elastic User Account.
     * 
     */
    @InputImport(name="emailAddress", required=true)
        private final String emailAddress;

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * User Id of the elastic account of the User.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    public ElasticCloudUserResponse(
        String elasticCloudSsoDefaultUrl,
        String emailAddress,
        String id) {
        this.elasticCloudSsoDefaultUrl = Objects.requireNonNull(elasticCloudSsoDefaultUrl, "expected parameter 'elasticCloudSsoDefaultUrl' to be non-null");
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ElasticCloudUserResponse() {
        this.elasticCloudSsoDefaultUrl = null;
        this.emailAddress = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticCloudUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elasticCloudSsoDefaultUrl;
        private String emailAddress;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticCloudUserResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticCloudSsoDefaultUrl = defaults.elasticCloudSsoDefaultUrl;
    	      this.emailAddress = defaults.emailAddress;
    	      this.id = defaults.id;
        }

        public Builder setElasticCloudSsoDefaultUrl(String elasticCloudSsoDefaultUrl) {
            this.elasticCloudSsoDefaultUrl = Objects.requireNonNull(elasticCloudSsoDefaultUrl);
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public ElasticCloudUserResponse build() {
            return new ElasticCloudUserResponse(elasticCloudSsoDefaultUrl, emailAddress, id);
        }
    }
}
