// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An action that can manipulate an http header.
 * 
 */
public final class HeaderActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HeaderActionResponse Empty = new HeaderActionResponse();

    /**
     * Which type of manipulation to apply to the header.
     * 
     */
    @InputImport(name="headerActionType", required=true)
    private final String headerActionType;

    public String getHeaderActionType() {
        return this.headerActionType;
    }

    /**
     * The name of the header this action will apply to.
     * 
     */
    @InputImport(name="headerName", required=true)
    private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * The value to update the given header name with. This value is not used if the actionType is Delete.
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public HeaderActionResponse(
        String headerActionType,
        String headerName,
        @Nullable String value) {
        this.headerActionType = Objects.requireNonNull(headerActionType, "expected parameter 'headerActionType' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.value = value;
    }

    private HeaderActionResponse() {
        this.headerActionType = null;
        this.headerName = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerActionType;
        private String headerName;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerActionType = defaults.headerActionType;
    	      this.headerName = defaults.headerName;
    	      this.value = defaults.value;
        }

        public Builder setHeaderActionType(String headerActionType) {
            this.headerActionType = Objects.requireNonNull(headerActionType);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public HeaderActionResponse build() {
            return new HeaderActionResponse(headerActionType, headerName, value);
        }
    }
}
