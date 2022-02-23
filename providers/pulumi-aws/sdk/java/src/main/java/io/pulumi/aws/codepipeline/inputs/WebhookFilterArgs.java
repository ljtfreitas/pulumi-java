// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebhookFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookFilterArgs Empty = new WebhookFilterArgs();

    /**
     * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
     * 
     */
    @InputImport(name="jsonPath", required=true)
    private final Input<String> jsonPath;

    public Input<String> getJsonPath() {
        return this.jsonPath;
    }

    /**
     * The value to match on (e.g., `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
     * 
     */
    @InputImport(name="matchEquals", required=true)
    private final Input<String> matchEquals;

    public Input<String> getMatchEquals() {
        return this.matchEquals;
    }

    public WebhookFilterArgs(
        Input<String> jsonPath,
        Input<String> matchEquals) {
        this.jsonPath = Objects.requireNonNull(jsonPath, "expected parameter 'jsonPath' to be non-null");
        this.matchEquals = Objects.requireNonNull(matchEquals, "expected parameter 'matchEquals' to be non-null");
    }

    private WebhookFilterArgs() {
        this.jsonPath = Input.empty();
        this.matchEquals = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> jsonPath;
        private Input<String> matchEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
    	      this.matchEquals = defaults.matchEquals;
        }

        public Builder setJsonPath(Input<String> jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }

        public Builder setJsonPath(String jsonPath) {
            this.jsonPath = Input.of(Objects.requireNonNull(jsonPath));
            return this;
        }

        public Builder setMatchEquals(Input<String> matchEquals) {
            this.matchEquals = Objects.requireNonNull(matchEquals);
            return this;
        }

        public Builder setMatchEquals(String matchEquals) {
            this.matchEquals = Input.of(Objects.requireNonNull(matchEquals));
            return this;
        }
        public WebhookFilterArgs build() {
            return new WebhookFilterArgs(jsonPath, matchEquals);
        }
    }
}
