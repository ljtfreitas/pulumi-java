// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatabaseInstanceSettingsDatabaseFlagGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsDatabaseFlagGetArgs Empty = new DatabaseInstanceSettingsDatabaseFlagGetArgs();

    /**
     * A name for this whitelist entry.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * A CIDR notation IPv4 or IPv6 address that is allowed to
     * access this instance. Must be set even if other two attributes are not for
     * the whitelist to become active.
     * 
     */
    @InputImport(name="value", required=true)
        private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public DatabaseInstanceSettingsDatabaseFlagGetArgs(
        Input<String> name,
        Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private DatabaseInstanceSettingsDatabaseFlagGetArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsDatabaseFlagGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsDatabaseFlagGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public DatabaseInstanceSettingsDatabaseFlagGetArgs build() {
            return new DatabaseInstanceSettingsDatabaseFlagGetArgs(name, value);
        }
    }
}
