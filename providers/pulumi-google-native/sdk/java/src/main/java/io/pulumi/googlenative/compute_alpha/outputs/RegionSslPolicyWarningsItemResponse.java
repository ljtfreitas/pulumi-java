// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RegionSslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RegionSslPolicyWarningsItemResponse {
    private final String code;
    private final List<RegionSslPolicyWarningsItemDataItemResponse> data;
    private final String message;

    @OutputCustomType.Constructor({"code","data","message"})
    private RegionSslPolicyWarningsItemResponse(
        String code,
        List<RegionSslPolicyWarningsItemDataItemResponse> data,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.data = Objects.requireNonNull(data);
        this.message = Objects.requireNonNull(message);
    }

    public String getCode() {
        return this.code;
    }
    public List<RegionSslPolicyWarningsItemDataItemResponse> getData() {
        return this.data;
    }
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<RegionSslPolicyWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSslPolicyWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setData(List<RegionSslPolicyWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public RegionSslPolicyWarningsItemResponse build() {
            return new RegionSslPolicyWarningsItemResponse(code, data, message);
        }
    }
}