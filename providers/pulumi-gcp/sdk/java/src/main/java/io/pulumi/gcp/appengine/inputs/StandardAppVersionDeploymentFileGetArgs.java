// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentFileGetArgs Empty = new StandardAppVersionDeploymentFileGetArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * SHA1 checksum of the file
     * 
     */
    @InputImport(name="sha1Sum")
        private final @Nullable Input<String> sha1Sum;

    public Input<String> getSha1Sum() {
        return this.sha1Sum == null ? Input.empty() : this.sha1Sum;
    }

    /**
     * Source URL
     * 
     */
    @InputImport(name="sourceUrl", required=true)
        private final Input<String> sourceUrl;

    public Input<String> getSourceUrl() {
        return this.sourceUrl;
    }

    public StandardAppVersionDeploymentFileGetArgs(
        Input<String> name,
        @Nullable Input<String> sha1Sum,
        Input<String> sourceUrl) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sha1Sum = sha1Sum;
        this.sourceUrl = Objects.requireNonNull(sourceUrl, "expected parameter 'sourceUrl' to be non-null");
    }

    private StandardAppVersionDeploymentFileGetArgs() {
        this.name = Input.empty();
        this.sha1Sum = Input.empty();
        this.sourceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionDeploymentFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> sha1Sum;
        private Input<String> sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionDeploymentFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sha1Sum = defaults.sha1Sum;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSha1Sum(@Nullable Input<String> sha1Sum) {
            this.sha1Sum = sha1Sum;
            return this;
        }

        public Builder setSha1Sum(@Nullable String sha1Sum) {
            this.sha1Sum = Input.ofNullable(sha1Sum);
            return this;
        }

        public Builder setSourceUrl(Input<String> sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }

        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = Input.of(Objects.requireNonNull(sourceUrl));
            return this;
        }
        public StandardAppVersionDeploymentFileGetArgs build() {
            return new StandardAppVersionDeploymentFileGetArgs(name, sha1Sum, sourceUrl);
        }
    }
}
