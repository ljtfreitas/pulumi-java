// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A TXT record.
 * 
 */
public final class TxtRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final TxtRecordResponse Empty = new TxtRecordResponse();

    /**
     * The text value of this TXT record.
     * 
     */
    @InputImport(name="value")
        private final @Nullable List<String> value;

    public List<String> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public TxtRecordResponse(@Nullable List<String> value) {
        this.value = value;
    }

    private TxtRecordResponse() {
        this.value = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TxtRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TxtRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable List<String> value) {
            this.value = value;
            return this;
        }
        public TxtRecordResponse build() {
            return new TxtRecordResponse(value);
        }
    }
}
