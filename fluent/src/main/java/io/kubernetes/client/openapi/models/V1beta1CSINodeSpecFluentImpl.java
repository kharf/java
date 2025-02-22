package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1CSINodeSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> drivers;

    public V1beta1CSINodeSpecFluentImpl() {
    }

    public V1beta1CSINodeSpecFluentImpl(io.kubernetes.client.openapi.models.V1beta1CSINodeSpec instance) {
        this.withDrivers(instance.getDrivers());
    }

    public A addToDrivers(int index,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item) {
        if (this.drivers == null) {this.drivers = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);_visitables.get("drivers").add(index >= 0 ? index : _visitables.get("drivers").size(), builder);this.drivers.add(index >= 0 ? index : drivers.size(), builder); return (A)this;
    }

    public A setToDrivers(int index,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item) {
        if (this.drivers == null) {this.drivers = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);
        if (index < 0 || index >= _visitables.get("drivers").size()) { _visitables.get("drivers").add(builder); } else { _visitables.get("drivers").set(index, builder);}
        if (index < 0 || index >= drivers.size()) { drivers.add(builder); } else { drivers.set(index, builder);}
         return (A)this;
    }

    public A addToDrivers(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver... items) {
        if (this.drivers == null) {this.drivers = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item : items) {io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);_visitables.get("drivers").add(builder);this.drivers.add(builder);} return (A)this;
    }

    public A addAllToDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver> items) {
        if (this.drivers == null) {this.drivers = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item : items) {io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);_visitables.get("drivers").add(builder);this.drivers.add(builder);} return (A)this;
    }

    public A removeFromDrivers(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver... items) {
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item : items) {io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder);if (this.drivers != null) {this.drivers.remove(builder);}} return (A)this;
    }

    public A removeAllFromDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver> items) {
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item : items) {io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder);if (this.drivers != null) {this.drivers.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromDrivers(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> predicate) {
        if (drivers == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> each = drivers.iterator();
        final List visitables = _visitables.get("drivers");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDrivers instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver> getDrivers() {
        return build(drivers);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver> buildDrivers() {
        return build(drivers);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriver buildDriver(int index) {
        return this.drivers.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriver buildFirstDriver() {
        return this.drivers.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriver buildLastDriver() {
        return this.drivers.get(drivers.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriver buildMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder item: drivers) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder item: drivers) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withDrivers(java.util.List<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver> drivers) {
        if (this.drivers != null) { _visitables.get("drivers").removeAll(this.drivers);}
        if (drivers != null) {this.drivers = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item : drivers){this.addToDrivers(item);}} else { this.drivers = null;} return (A) this;
    }

    public A withDrivers(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver... drivers) {
        if (this.drivers != null) {this.drivers.clear();}
        if (drivers != null) {for (io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item :drivers){ this.addToDrivers(item);}} return (A) this;
    }

    public java.lang.Boolean hasDrivers() {
        return drivers != null && !drivers.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> addNewDriver() {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluentImpl.DriversNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item) {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluentImpl.DriversNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(int index,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item) {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluentImpl.DriversNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> editDriver(int index) {
        if (drivers.size() <= index) throw new RuntimeException("Can't edit drivers. Index exceeds size.");
        return setNewDriverLike(index, buildDriver(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> editFirstDriver() {
        if (drivers.size() == 0) throw new RuntimeException("Can't edit first drivers. The list is empty.");
        return setNewDriverLike(0, buildDriver(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> editLastDriver() {
        int index = drivers.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last drivers. The list is empty.");
        return setNewDriverLike(index, buildDriver(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<A> editMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> predicate) {
        int index = -1;
        for (int i=0;i<drivers.size();i++) { 
        if (predicate.test(drivers.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching drivers. No match found.");
        return setNewDriverLike(index, buildDriver(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CSINodeSpecFluentImpl that = (V1beta1CSINodeSpecFluentImpl) o;
        if (drivers != null ? !drivers.equals(that.drivers) :that.drivers != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(drivers,  super.hashCode());
    }

    public class DriversNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluent.DriversNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder builder;
        private final int index;

            DriversNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(this, item);
                        
            }

            DriversNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CSINodeSpecFluentImpl.this.setToDrivers(index,builder.build());
            }

            public N endDriver() {
                return and();
            }
    }


}
