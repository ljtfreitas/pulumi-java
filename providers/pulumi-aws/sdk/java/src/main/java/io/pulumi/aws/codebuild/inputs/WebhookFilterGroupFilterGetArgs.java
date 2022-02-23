// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookFilterGroupFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookFilterGroupFilterGetArgs Empty = new WebhookFilterGroupFilterGetArgs();

    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     * 
     */
    @InputImport(name="excludeMatchedPattern")
    private final @Nullable Input<Boolean> excludeMatchedPattern;

    public Input<Boolean> getExcludeMatchedPattern() {
        return this.excludeMatchedPattern == null ? Input.empty() : this.excludeMatchedPattern;
    }

    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     * 
     */
    @InputImport(name="pattern", required=true)
    private final Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern;
    }

    /**
     * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public WebhookFilterGroupFilterGetArgs(
        @Nullable Input<Boolean> excludeMatchedPattern,
        Input<String> pattern,
        Input<String> type) {
        this.excludeMatchedPattern = excludeMatchedPattern;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebhookFilterGroupFilterGetArgs() {
        this.excludeMatchedPattern = Input.empty();
        this.pattern = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGroupFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> excludeMatchedPattern;
        private Input<String> pattern;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGroupFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMatchedPattern = defaults.excludeMatchedPattern;
    	      this.pattern = defaults.pattern;
    	      this.type = defaults.type;
        }

        public Builder setExcludeMatchedPattern(@Nullable Input<Boolean> excludeMatchedPattern) {
            this.excludeMatchedPattern = excludeMatchedPattern;
            return this;
        }

        public Builder setExcludeMatchedPattern(@Nullable Boolean excludeMatchedPattern) {
            this.excludeMatchedPattern = Input.ofNullable(excludeMatchedPattern);
            return this;
        }

        public Builder setPattern(Input<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Input.of(Objects.requireNonNull(pattern));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public WebhookFilterGroupFilterGetArgs build() {
            return new WebhookFilterGroupFilterGetArgs(excludeMatchedPattern, pattern, type);
        }
    }
}
