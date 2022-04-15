// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentFileGetArgs Empty = new FlexibleAppVersionDeploymentFileGetArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * SHA1 checksum of the file
     * 
     */
    @Import(name="sha1Sum")
      private final @Nullable Output<String> sha1Sum;

    public Output<String> sha1Sum() {
        return this.sha1Sum == null ? Codegen.empty() : this.sha1Sum;
    }

    /**
     * Source URL
     * 
     */
    @Import(name="sourceUrl", required=true)
      private final Output<String> sourceUrl;

    public Output<String> sourceUrl() {
        return this.sourceUrl;
    }

    public FlexibleAppVersionDeploymentFileGetArgs(
        Output<String> name,
        @Nullable Output<String> sha1Sum,
        Output<String> sourceUrl) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sha1Sum = sha1Sum;
        this.sourceUrl = Objects.requireNonNull(sourceUrl, "expected parameter 'sourceUrl' to be non-null");
    }

    private FlexibleAppVersionDeploymentFileGetArgs() {
        this.name = Codegen.empty();
        this.sha1Sum = Codegen.empty();
        this.sourceUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> sha1Sum;
        private Output<String> sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sha1Sum = defaults.sha1Sum;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder sha1Sum(@Nullable Output<String> sha1Sum) {
            this.sha1Sum = sha1Sum;
            return this;
        }
        public Builder sha1Sum(@Nullable String sha1Sum) {
            this.sha1Sum = Codegen.ofNullable(sha1Sum);
            return this;
        }
        public Builder sourceUrl(Output<String> sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Output.of(Objects.requireNonNull(sourceUrl));
            return this;
        }        public FlexibleAppVersionDeploymentFileGetArgs build() {
            return new FlexibleAppVersionDeploymentFileGetArgs(name, sha1Sum, sourceUrl);
        }
    }
}
