// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingResourceRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingResourceRecordArgs Empty = new DomainMappingResourceRecordArgs();

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="rrdata")
      private final @Nullable Output<String> rrdata;

    public Output<String> getRrdata() {
        return this.rrdata == null ? Output.empty() : this.rrdata;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DomainMappingResourceRecordArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> rrdata,
        @Nullable Output<String> type) {
        this.name = name;
        this.rrdata = rrdata;
        this.type = type;
    }

    private DomainMappingResourceRecordArgs() {
        this.name = Output.empty();
        this.rrdata = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingResourceRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> rrdata;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingResourceRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rrdata = defaults.rrdata;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder rrdata(@Nullable Output<String> rrdata) {
            this.rrdata = rrdata;
            return this;
        }

        public Builder rrdata(@Nullable String rrdata) {
            this.rrdata = Output.ofNullable(rrdata);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public DomainMappingResourceRecordArgs build() {
            return new DomainMappingResourceRecordArgs(name, rrdata, type);
        }
    }
}
