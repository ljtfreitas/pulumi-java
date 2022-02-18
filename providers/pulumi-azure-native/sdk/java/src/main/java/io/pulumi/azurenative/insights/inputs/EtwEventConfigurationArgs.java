// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EtwEventConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EtwEventConfigurationArgs Empty = new EtwEventConfigurationArgs();

    @InputImport(name="filter")
    private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    @InputImport(name="id", required=true)
    private final Input<Integer> id;

    public Input<Integer> getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public EtwEventConfigurationArgs(
        @Nullable Input<String> filter,
        Input<Integer> id,
        Input<String> name) {
        this.filter = filter;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private EtwEventConfigurationArgs() {
        this.filter = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwEventConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> filter;
        private Input<Integer> id;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwEventConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setId(Input<Integer> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(Integer id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public EtwEventConfigurationArgs build() {
            return new EtwEventConfigurationArgs(filter, id, name);
        }
    }
}
