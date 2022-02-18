// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourcePrecedenceResponse {
    /**
     * The data source reference id.
     * 
     */
    private final String dataSourceReferenceId;
    /**
     * The data source type.
     * 
     */
    private final String dataSourceType;
    /**
     * The data source ID.
     * 
     */
    private final Integer id;
    /**
     * The data source name
     * 
     */
    private final String name;
    /**
     * the precedence value.
     * 
     */
    private final @Nullable Integer precedence;
    /**
     * The data source status.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"dataSourceReferenceId","dataSourceType","id","name","precedence","status"})
    private DataSourcePrecedenceResponse(
        String dataSourceReferenceId,
        String dataSourceType,
        Integer id,
        String name,
        @Nullable Integer precedence,
        String status) {
        this.dataSourceReferenceId = Objects.requireNonNull(dataSourceReferenceId);
        this.dataSourceType = Objects.requireNonNull(dataSourceType);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.precedence = precedence;
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The data source reference id.
     * 
     */
    public String getDataSourceReferenceId() {
        return this.dataSourceReferenceId;
    }
    /**
     * The data source type.
     * 
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }
    /**
     * The data source ID.
     * 
     */
    public Integer getId() {
        return this.id;
    }
    /**
     * The data source name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * the precedence value.
     * 
     */
    public Optional<Integer> getPrecedence() {
        return Optional.ofNullable(this.precedence);
    }
    /**
     * The data source status.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePrecedenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceReferenceId;
        private String dataSourceType;
        private Integer id;
        private String name;
        private @Nullable Integer precedence;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePrecedenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceReferenceId = defaults.dataSourceReferenceId;
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.precedence = defaults.precedence;
    	      this.status = defaults.status;
        }

        public Builder setDataSourceReferenceId(String dataSourceReferenceId) {
            this.dataSourceReferenceId = Objects.requireNonNull(dataSourceReferenceId);
            return this;
        }

        public Builder setDataSourceType(String dataSourceType) {
            this.dataSourceType = Objects.requireNonNull(dataSourceType);
            return this;
        }

        public Builder setId(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrecedence(@Nullable Integer precedence) {
            this.precedence = precedence;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public DataSourcePrecedenceResponse build() {
            return new DataSourcePrecedenceResponse(dataSourceReferenceId, dataSourceType, id, name, precedence, status);
        }
    }
}
