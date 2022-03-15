// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An MX record.
 * 
 */
public final class MxRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final MxRecordResponse Empty = new MxRecordResponse();

    /**
     * The domain name of the mail host for this MX record.
     * 
     */
    @Import(name="exchange")
      private final @Nullable String exchange;

    public Optional<String> getExchange() {
        return this.exchange == null ? Optional.empty() : Optional.ofNullable(this.exchange);
    }

    /**
     * The preference value for this MX record.
     * 
     */
    @Import(name="preference")
      private final @Nullable Integer preference;

    public Optional<Integer> getPreference() {
        return this.preference == null ? Optional.empty() : Optional.ofNullable(this.preference);
    }

    public MxRecordResponse(
        @Nullable String exchange,
        @Nullable Integer preference) {
        this.exchange = exchange;
        this.preference = preference;
    }

    private MxRecordResponse() {
        this.exchange = null;
        this.preference = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exchange;
        private @Nullable Integer preference;

        public Builder() {
    	      // Empty
        }

        public Builder(MxRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        public Builder exchange(@Nullable String exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder preference(@Nullable Integer preference) {
            this.preference = preference;
            return this;
        }
        public MxRecordResponse build() {
            return new MxRecordResponse(exchange, preference);
        }
    }
}
