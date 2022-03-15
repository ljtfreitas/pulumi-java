// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for searching a Amazon Kendra index specified for the intent.
 * 
 */
public final class BotKendraConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotKendraConfigurationArgs Empty = new BotKendraConfigurationArgs();

    @Import(name="kendraIndex", required=true)
      private final Output<String> kendraIndex;

    public Output<String> getKendraIndex() {
        return this.kendraIndex;
    }

    @Import(name="queryFilterString")
      private final @Nullable Output<String> queryFilterString;

    public Output<String> getQueryFilterString() {
        return this.queryFilterString == null ? Output.empty() : this.queryFilterString;
    }

    /**
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra index.
     * 
     */
    @Import(name="queryFilterStringEnabled")
      private final @Nullable Output<Boolean> queryFilterStringEnabled;

    public Output<Boolean> getQueryFilterStringEnabled() {
        return this.queryFilterStringEnabled == null ? Output.empty() : this.queryFilterStringEnabled;
    }

    public BotKendraConfigurationArgs(
        Output<String> kendraIndex,
        @Nullable Output<String> queryFilterString,
        @Nullable Output<Boolean> queryFilterStringEnabled) {
        this.kendraIndex = Objects.requireNonNull(kendraIndex, "expected parameter 'kendraIndex' to be non-null");
        this.queryFilterString = queryFilterString;
        this.queryFilterStringEnabled = queryFilterStringEnabled;
    }

    private BotKendraConfigurationArgs() {
        this.kendraIndex = Output.empty();
        this.queryFilterString = Output.empty();
        this.queryFilterStringEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotKendraConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kendraIndex;
        private @Nullable Output<String> queryFilterString;
        private @Nullable Output<Boolean> queryFilterStringEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotKendraConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kendraIndex = defaults.kendraIndex;
    	      this.queryFilterString = defaults.queryFilterString;
    	      this.queryFilterStringEnabled = defaults.queryFilterStringEnabled;
        }

        public Builder kendraIndex(Output<String> kendraIndex) {
            this.kendraIndex = Objects.requireNonNull(kendraIndex);
            return this;
        }

        public Builder kendraIndex(String kendraIndex) {
            this.kendraIndex = Output.of(Objects.requireNonNull(kendraIndex));
            return this;
        }

        public Builder queryFilterString(@Nullable Output<String> queryFilterString) {
            this.queryFilterString = queryFilterString;
            return this;
        }

        public Builder queryFilterString(@Nullable String queryFilterString) {
            this.queryFilterString = Output.ofNullable(queryFilterString);
            return this;
        }

        public Builder queryFilterStringEnabled(@Nullable Output<Boolean> queryFilterStringEnabled) {
            this.queryFilterStringEnabled = queryFilterStringEnabled;
            return this;
        }

        public Builder queryFilterStringEnabled(@Nullable Boolean queryFilterStringEnabled) {
            this.queryFilterStringEnabled = Output.ofNullable(queryFilterStringEnabled);
            return this;
        }
        public BotKendraConfigurationArgs build() {
            return new BotKendraConfigurationArgs(kendraIndex, queryFilterString, queryFilterStringEnabled);
        }
    }
}
