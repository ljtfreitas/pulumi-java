// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HTTP referrers (websites) that are allowed to use the key.
 * 
 */
public final class V2BrowserKeyRestrictionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final V2BrowserKeyRestrictionsArgs Empty = new V2BrowserKeyRestrictionsArgs();

    /**
     * A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedReferrers")
      private final @Nullable Output<List<String>> allowedReferrers;

    public Output<List<String>> getAllowedReferrers() {
        return this.allowedReferrers == null ? Output.empty() : this.allowedReferrers;
    }

    public V2BrowserKeyRestrictionsArgs(@Nullable Output<List<String>> allowedReferrers) {
        this.allowedReferrers = allowedReferrers;
    }

    private V2BrowserKeyRestrictionsArgs() {
        this.allowedReferrers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2BrowserKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedReferrers;

        public Builder() {
    	      // Empty
        }

        public Builder(V2BrowserKeyRestrictionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedReferrers = defaults.allowedReferrers;
        }

        public Builder allowedReferrers(@Nullable Output<List<String>> allowedReferrers) {
            this.allowedReferrers = allowedReferrers;
            return this;
        }

        public Builder allowedReferrers(@Nullable List<String> allowedReferrers) {
            this.allowedReferrers = Output.ofNullable(allowedReferrers);
            return this;
        }
        public V2BrowserKeyRestrictionsArgs build() {
            return new V2BrowserKeyRestrictionsArgs(allowedReferrers);
        }
    }
}
