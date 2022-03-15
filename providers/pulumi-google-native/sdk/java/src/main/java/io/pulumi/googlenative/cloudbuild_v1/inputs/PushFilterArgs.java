// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Push contains filter properties for matching GitHub git pushes.
 * 
 */
public final class PushFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PushFilterArgs Empty = new PushFilterArgs();

    /**
     * Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branch")
      private final @Nullable Output<String> branch;

    public Output<String> getBranch() {
        return this.branch == null ? Output.empty() : this.branch;
    }

    /**
     * When true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
     */
    @Import(name="invertRegex")
      private final @Nullable Output<Boolean> invertRegex;

    public Output<Boolean> getInvertRegex() {
        return this.invertRegex == null ? Output.empty() : this.invertRegex;
    }

    /**
     * Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    public PushFilterArgs(
        @Nullable Output<String> branch,
        @Nullable Output<Boolean> invertRegex,
        @Nullable Output<String> tag) {
        this.branch = branch;
        this.invertRegex = invertRegex;
        this.tag = tag;
    }

    private PushFilterArgs() {
        this.branch = Output.empty();
        this.invertRegex = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> branch;
        private @Nullable Output<Boolean> invertRegex;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(PushFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.invertRegex = defaults.invertRegex;
    	      this.tag = defaults.tag;
        }

        public Builder branch(@Nullable Output<String> branch) {
            this.branch = branch;
            return this;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = Output.ofNullable(branch);
            return this;
        }

        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }

        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Output.ofNullable(invertRegex);
            return this;
        }

        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }
        public PushFilterArgs build() {
            return new PushFilterArgs(branch, invertRegex, tag);
        }
    }
}
